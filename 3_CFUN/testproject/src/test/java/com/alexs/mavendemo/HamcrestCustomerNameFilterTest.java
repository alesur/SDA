package com.alexs.mavendemo;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.collection.IsIn.*;
import static org.junit.Assert.assertThat;

import org.hamcrest.collection.IsIn;
import org.junit.Test;

public class HamcrestCustomerNameFilterTest {

    @Test
    public void customerNameFilter_givenNamesOfVaryingLength_return2names() {
        // given
        String[] array = new String[]{"Mindaugas", "Jonasasas"};

        // when
        String[] result = UserNameFilter.filername(array);

        // then
        assertThat("Jonasasas", isIn(result));
    }


    @Test
    public void test() {
        // given

        // when
        String result = UserNameFilter.checkaname("Mindaugas");

        // then
        assertThat(result, is("Mind"));
    }
}