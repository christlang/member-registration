package de.cutl.djk.memberregistration;

import org.springframework.stereotype.Service;

import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

@Service
public class RegistrationStore {

    private final ConcurrentHashMap<UUID, Registration> store = new ConcurrentHashMap<>();


    public void put(UUID uuid, Registration registration) {
        store.put(uuid, registration);
    }

    public Registration get(UUID uuid) {
        return store.get(uuid);
    }
}
