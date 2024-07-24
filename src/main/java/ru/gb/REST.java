package ru.gb;

public class REST {

    /**
     * REST - Representation Stateful Transfer
     *
     * HTTP - протокол
     * gRPC - протокол
     * WebSockets - протокол
     *
     * Путь\эндпоинт\ручка\ресурс - /timesheet
     *
     * REST - набор соглашений, как оформлять\проектировать ресурсы вашего сервиса
     * 1. НЕ использовать глаголы в путях
     * /deleteTimesheet/{id} - плохо
     * DELETE /timesheet/{id} - хорошо
     *
     * 2. Ресурсы должны вкладываться друг в друга
     * GET /users/{userId}/roles/{roleId} - получить РОЛЬ с идентификатором roleId у юзера userId
     * GET /roles/{id}
     * GET /departments/{id}/employees/{id}/head/consultant/roles/{id}
     *
     * Получить юзеров, у которых имя содержит какую-то подстроку
     * GET /users?name-like="adfasdf" -> 204 No Content
     * GET /users?sort-by=age&sort-order=desc
     *
     * 3. Рекомендация: использовать множественное число для ресурсов
     * Вместо /user использовать /users
     *
     * 4. Слова внутри ресурса соединяются дефисом
     * GET github.com/project/pull-requests/{id}
     *
     *
     *
     */

    /**
     * API - спецификация, протокол, интерфейс, (формат), правила, (договор), контракт ...
     * API Application Programming Interface
     *
     * REST
     *
     * Shop
     * Product - продукт
     * -- Предусмотреть шаблон для создания продукта
     * GET /products - все продукты
     * GET /products/{id} - получить конкретный продукт
     * -- Предусмотреть запрос для поиска (aka like)
     * POST /products - создать продукт
     * PUT /products - обновить продукт
     * PATCH /products - обновить продукт (с выборочными полями)
     *
     * Profile - настройки пользователя
     * GET /profile/{id} - получить настройки пользователя
     * PUT /profile/{id} - обновить
     * -- Для получения данных текущего пользователя лучше передавать некий "токен" в заголовке
     *
     * Registration - регистрация нового пользователя
     * POST /registration body = {}
     *
     * Cart - корзина пользователя
     * Все запросы должны содержать некий "токен", который подтверждает текущего пользователя
     * GET /cart - получить "корзину" текущего пользователя
     * POST /cart/{productId} - добавление товара в корзину
     * POST /cart/{productId}?newCount=X - сделать количество товара в корзине равным Х
     * или POST /cart body = {productId = X, count = X, ...}
     * DELETE /cart/{productId} - удалить товар из корины (с любым количеством)
     *
     * /v2/... - версия два
     * /v3/**
     * /v4/***
     */
}
