
package com.litke.project_manager.pm_business.repositories;

import com.litke.project_manager.pm_business.models.Member;
import com.litke.project_manager.pm_business.models.enums.MemberStatus;
import com.litke.project_manager.pm_business.repositories.impl.MemberStorage;
import org.junit.jupiter.api.Test;

public class MemberStorageTest {
    private static final String fileStorageName = "src/test/resources/memberStorage.txt";
    private final MemberStorage memberStorage = new MemberStorage();

    @Test
    public void createMethodTest(){
        memberStorage.create(new Member("John","Dorian"));
        memberStorage.create(Member.builder().firstName("Elliot")
                .lastName("Rid").email("er@hg.com").status(MemberStatus.ACTIVE).build());
        memberStorage.create(new Member("Perry","Cocks"));
        memberStorage.create(new Member("Kristofer","Turk"));
        memberStorage.create(Member.builder().firstName("Turk").status(MemberStatus.DELETED).build());
        memberStorage.writeStorage(fileStorageName);
    }

    @Test
    public void executeTest() {
        MemberStorage storage = new MemberStorage();
        storage.readStorage(fileStorageName);
        storage.update(Member.builder().id(3L).email("pk@sf.com").build());
        assert storage.deleteById(2L).getStatus().equals(MemberStatus.DELETED);
        storage.update(Member.builder().id(2L).lastName(null).build());
        storage.update(Member.builder().id(4L).lastName(null).build());
        storage.writeStorage(fileStorageName);
        System.out.println(storage.getById(2L));
        System.out.println(storage.getAll());
    }
}
