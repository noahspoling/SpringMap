package com.noahspoling.Atlas.Model;

import io.javalin.security.Role;

enum class Role : RouteRole {ANYONE, READ, WRITE}
