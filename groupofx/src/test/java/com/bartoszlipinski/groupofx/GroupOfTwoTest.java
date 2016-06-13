package com.bartoszlipinski.groupofx;

import org.junit.Test;

import static com.google.common.truth.Truth.assertThat;

/**
 * Created by Bartosz Lipinski
 * 13.06.2016
 */
public class GroupOfTwoTest {

    @Test
    public void testCreate() throws Exception {
        Group.OfTwo<Integer, String> group = new Group.OfTwo<>(1, "second");
        assertThat(group.first).isEqualTo(1);
        assertThat(group.second).isEqualTo("second");

        group = Group.OfTwo.create(1, "second");
        assertThat(group.first).isEqualTo(1);
        assertThat(group.second).isEqualTo("second");
    }

    @Test
    public void testEqualsAndHashcode() throws Exception {
        Group.OfTwo<Integer, String> groupOne = new Group.OfTwo<>(1, "second");
        Group.OfTwo<Integer, String> groupTwo = new Group.OfTwo<>(1, "second");

        assertThat(groupOne.equals(groupTwo)).isTrue();
        assertThat(groupOne.hashCode()).isEqualTo(groupTwo.hashCode());

        //all different
        groupTwo.first = 2;
        groupTwo.second = "not_second";
        assertThat(groupOne.equals(groupTwo)).isFalse();
        assertThat(groupOne.hashCode()).isNotEqualTo(groupTwo.hashCode());

        //one different
        groupTwo.first = 1;
        groupTwo.second = "not_second";
        assertThat(groupOne.equals(groupTwo)).isFalse();
        assertThat(groupOne.hashCode()).isNotEqualTo(groupTwo.hashCode());

        groupTwo.first = 2;
        groupTwo.second = "second";
        assertThat(groupOne.equals(groupTwo)).isFalse();
        assertThat(groupOne.hashCode()).isNotEqualTo(groupTwo.hashCode());
    }
}