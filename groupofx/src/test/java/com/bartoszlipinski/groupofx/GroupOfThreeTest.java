package com.bartoszlipinski.groupofx;

import org.junit.Test;

import static com.google.common.truth.Truth.assertThat;

/**
 * Created by Bartosz Lipinski
 * 13.06.2016
 */
public class GroupOfThreeTest {

    @SuppressWarnings("deprecation")
    @Test
    public void testCreate() throws Exception {
        Group.OfThree<Integer, String, Float> group = new Group.OfThree<>(1, "second", 3.1f);
        assertThat(group.first).isEqualTo(1);
        assertThat(group.second).isEqualTo("second");
        assertThat(group.third).isEqualTo(3.1f);

        group = Group.OfThree.create(1, "second", 3.1f);
        assertThat(group.first).isEqualTo(1);
        assertThat(group.second).isEqualTo("second");
        assertThat(group.third).isEqualTo(3.1f);
    }

    @Test
    public void testEqualsAndHashcode() throws Exception {
        Group.OfThree<Integer, String, Float> groupOne = new Group.OfThree<>(1, "second", 3.1f);
        Group.OfThree<Integer, String, Float> groupTwo = new Group.OfThree<>(1, "second", 3.1f);

        assertThat(groupOne.equals(groupTwo)).isTrue();
        assertThat(groupOne.hashCode()).isEqualTo(groupTwo.hashCode());

        //all different
        groupTwo.first = 2;
        groupTwo.second = "not_second";
        groupTwo.third = 3.2f;
        assertThat(groupOne.equals(groupTwo)).isFalse();
        assertThat(groupOne.hashCode()).isNotEqualTo(groupTwo.hashCode());

        //one different
        groupTwo.first = 1;
        groupTwo.second = "not_second";
        groupTwo.third = 3.1f;
        assertThat(groupOne.equals(groupTwo)).isFalse();
        assertThat(groupOne.hashCode()).isNotEqualTo(groupTwo.hashCode());

        groupTwo.first = 2;
        groupTwo.second = "second";
        groupTwo.third = 3.1f;
        assertThat(groupOne.equals(groupTwo)).isFalse();
        assertThat(groupOne.hashCode()).isNotEqualTo(groupTwo.hashCode());

        groupTwo.first = 1;
        groupTwo.second = "second";
        groupTwo.third = 3.2f;
        assertThat(groupOne.equals(groupTwo)).isFalse();
        assertThat(groupOne.hashCode()).isNotEqualTo(groupTwo.hashCode());
    }

}