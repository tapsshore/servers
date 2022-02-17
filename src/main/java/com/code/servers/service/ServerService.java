package com.code.servers.service;

import com.code.servers.model.Server;

import java.util.Collection;

public interface ServerService {

    Server create(Server server);
    Server ping(String ipAddress);
    Collection<Server> list(int limit);
    Server get(Long id);
    Server update(Server server);
    Server delete(Long id);
}
