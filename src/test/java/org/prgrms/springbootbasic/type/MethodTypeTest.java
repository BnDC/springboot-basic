package org.prgrms.springbootbasic.type;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.prgrms.springbootbasic.type.MethodType.isExist;

class MethodTypeTest {

    @Test
    void testIsExit_success() {
        assertThat(isExist("exit"), is(true));
    }

    @Test
    void testIsExit_fail() {
        assertThat(isExist("aaaaa"), is(false));
    }

    @Test
    void isCreateVoucher_success() {
        assertThat(MethodType.isCreateVoucher("create"), is(true));
    }

    @Test
    void isCreateVoucher_fail() {
        assertThat(MethodType.isCreateVoucher("not create"), is(false));
    }

    @Test
    void isLookupList_success() {
        assertThat(MethodType.isLookupList("lookup"), is(true));
    }

    @Test
    void isLookupList_fail() {
        assertThat(MethodType.isLookupList("not lookup"), is(false));
    }

    @Test
    void validate_success() {
        assertThat(MethodType.validate("create"), is(true));
        assertThat(MethodType.validate("lookup"), is(true));
        assertThat(MethodType.validate("exit"), is(true));
    }

    @Test
    void validate_fail() {
        assertThat(MethodType.validate("not create"), is(false));
        assertThat(MethodType.validate("not lookup"), is(false));
        assertThat(MethodType.validate("not exit"), is(false));
    }
}