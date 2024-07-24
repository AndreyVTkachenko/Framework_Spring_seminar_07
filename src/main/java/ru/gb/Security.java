package ru.gb;

public class Security {

    /**
     * Authority (Role) - Какая-то строка, которая описывает возможность получения какого-то ресурса.
     * admin, user, anonymous, role_create_user, role_delete_user
     *
     * SecurityContext - контейнер, в котором хранятся текущие привилегии "пользователя"
     * // <JSessionToken, username>
     *
     * SecurityFilterChain - набор (цепочка) "фильтров", которые срабатывают на каждый запрос на сервер,
     * и каждый из этих фильтров пытается понять, "кто" пришел на сервер и можно ли ему отдавать запрашиваемый ресурс.
     *
     * OAuth2
     * client -> AuthorizationServer
     * client <-token- AuthorizationServer
     *
     * client -token-> ResourceServer -token> AuthorizationServer
     *
     */
}
