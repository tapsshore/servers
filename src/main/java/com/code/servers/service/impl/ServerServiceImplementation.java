package com.code.servers.service.impl;

import com.code.servers.model.Server;
import com.code.servers.repository.ServerRepository;
import com.code.servers.service.ServerService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Collection;

@RequiredArgsConstructor
@Service
@Transactional
@Slf4j
public class ServerServiceImplementation implements ServerService {
    private final ServerRepository serverRepository;
    @Override
    public Server create(Server server) {
        log.info("Saving new server:{}",server.getName());
        server.setImageUrl(server.getImageUrl());
        return serverRepository.save(server);
    }

    @Override
    public Server ping(String ipAddress) {
        return null;
    }

    @Override
    public Collection<Server> list(int limit) {
        return null;
    }

    @Override
    public Server get(Long id) {
        return null;
    }

    @Override
    public Server update(Server server) {
        return null;
    }

    @Override
    public Server delete(Long id) {
        return null;
    }
}
