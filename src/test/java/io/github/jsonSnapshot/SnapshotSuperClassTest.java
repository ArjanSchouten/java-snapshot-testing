package io.github.jsonSnapshot;


import org.junit.jupiter.api.Test;

import static io.github.jsonSnapshot.SnapshotMatcher.expect;

public abstract class SnapshotSuperClassTest {

    public abstract String getName();

    @Test
    public void shouldMatchSnapshotOne() {
        expect(getName()).toMatchSnapshot();
    }

}
