package ru.gb.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.gb.model.Project;
import ru.gb.model.Timesheet;
import ru.gb.page.TimesheetPageDto;

import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class TimesheetPageService {

  private final TimesheetService timesheetService;
  private final ProjectService projectService;

  public List<TimesheetPageDto> findAll() {
    return timesheetService.findAll().stream()
      .map(this::convert)
      .toList();
  }

  public Optional<TimesheetPageDto> findById(Long id) {
    return timesheetService.findById(id) // Optional<Timesheet>
      .map(this::convert);
  }

  private TimesheetPageDto convert(Timesheet timesheet) {
    Project project = projectService.findById(timesheet.getProjectId())
      .orElseThrow();

    TimesheetPageDto timesheetPageParameters = new TimesheetPageDto();
    timesheetPageParameters.setProjectName(project.getName());
    timesheetPageParameters.setId(String.valueOf(timesheet.getId()));
    // 150 -> 2h30m
    timesheetPageParameters.setMinutes(String.valueOf(timesheet.getMinutes()));
    timesheetPageParameters.setCreatedAt(timesheet.getCreatedAt().format(DateTimeFormatter.ISO_DATE));

    return timesheetPageParameters;
  }

}
