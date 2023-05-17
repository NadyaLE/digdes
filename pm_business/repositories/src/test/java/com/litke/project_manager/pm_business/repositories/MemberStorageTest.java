
package com.litke.project_manager.pm_business.repositories;

import com.litke.project_manager.pm_business.models.enums.MemberStatus;
import com.litke.project_manager.pm_business.repositories.impl.MemberStorage;
import com.litke.project_manager.pm_dto.MemberDto;
import org.junit.jupiter.api.Test;

import java.util.Optional;

public class MemberStorageTest {
    private static final String fileStorageName = "src/test/resources/memberStorage.txt";
    private final MemberStorage memberStorage = new MemberStorage();

    @Test
    public void createMethodTest() {
        memberStorage.create(MemberDto.builder().firstName(Optional.of("John")).lastName(Optional.of("Dorian")).build());
        memberStorage.create(MemberDto.builder().firstName(Optional.of("Elliot"))
                .lastName(Optional.of("Rid")).email(Optional.of("er@hg.com")).build());
        memberStorage.create(MemberDto.builder().firstName(Optional.of("Perry")).lastName(Optional.of("Cocks")).build());
        memberStorage.create(MemberDto.builder().firstName(Optional.of("Kristofer")).lastName(Optional.of("Turk")).build());
        memberStorage.create(MemberDto.builder().firstName(Optional.of("Turk")).status(Optional.of(MemberStatus.DELETED)).build());
        memberStorage.writeStorage(fileStorageName);
    }

    @Test
    public void executeTest() {
        MemberStorage storage = new MemberStorage();
        storage.readStorage(fileStorageName);
        storage.update(MemberDto.builder().id(Optional.of(3L)).email(Optional.of("pk@sf.com")).build());
        assert storage.deleteById(2L).getStatus().equals(MemberStatus.DELETED);
        storage.update(MemberDto.builder().id(Optional.of(2L)).lastName(Optional.empty()).build());
        storage.update(MemberDto.builder().id(Optional.of(4L)).lastName(Optional.empty()).build());
        storage.writeStorage(fileStorageName);
        System.out.println(storage.getById(2L));
        System.out.println(storage.getAll());
    }
}
