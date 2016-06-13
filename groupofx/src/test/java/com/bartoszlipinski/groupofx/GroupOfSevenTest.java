package com.bartoszlipinski.groupofx;

import org.junit.Test;

import static com.google.common.truth.Truth.assertThat;

/**
 * Created by Bartosz Lipinski
 * 13.06.2016
 */
public class GroupOfSevenTest {

    @SuppressWarnings("deprecation")
    @Test
    public void testCreate() throws Exception {
        Group.OfSeven<Integer, String, Float, Double, Long, Integer, String > group =
                new Group.OfSeven<>(1, "second", 3.1f, 4.2, 5000L, 6, "seventh");
        assertThat(group.first).isEqualTo(1);
        assertThat(group.second).isEqualTo("second");
        assertThat(group.third).isEqualTo(3.1f);
        assertThat(group.fourth).isEqualTo(4.2);
        assertThat(group.fifth).isEqualTo(5000L);
        assertThat(group.sixth).isEqualTo(6);
        assertThat(group.seventh).isEqualTo("seventh");

        group =
                Group.OfSeven.create(1, "second", 3.1f, 4.2, 5000L, 6, "seventh");
        assertThat(group.first).isEqualTo(1);
        assertThat(group.second).isEqualTo("second");
        assertThat(group.third).isEqualTo(3.1f);
        assertThat(group.fourth).isEqualTo(4.2);
        assertThat(group.fifth).isEqualTo(5000L);
        assertThat(group.sixth).isEqualTo(6);
        assertThat(group.seventh).isEqualTo("seventh");
    }

    @Test
    public void testEqualsAndHashcode() throws Exception {
        Group.OfSeven<Integer, String, Float, Double, Long, Integer, String> groupOne =
                new Group.OfSeven<>(1, "second", 3.1f, 4.2, 5000L, 6, "seventh");
        Group.OfSeven<Integer, String, Float, Double, Long, Integer, String> groupTwo =
                new Group.OfSeven<>(1, "second", 3.1f, 4.2, 5000L, 6, "seventh");

        assertThat(groupOne.equals(groupTwo)).isTrue();
        assertThat(groupOne.hashCode()).isEqualTo(groupTwo.hashCode());

        //all different
        groupTwo.first = 2;
        groupTwo.second = "not_second";
        groupTwo.third = 3.2f;
        groupTwo.fourth = 4.3;
        groupTwo.fifth = 5001L;
        groupTwo.sixth = 7;
        groupTwo.seventh = "not_seventh";
        assertThat(groupOne.equals(groupTwo)).isFalse();
        assertThat(groupOne.hashCode()).isNotEqualTo(groupTwo.hashCode());

        //one different
        groupTwo.first = 1;
        groupTwo.second = "not_second";
        groupTwo.third = 3.1f;
        groupTwo.fourth = 4.2;
        groupTwo.fifth = 5000L;
        groupTwo.sixth = 6;
        groupTwo.seventh = "seventh";
        assertThat(groupOne.equals(groupTwo)).isFalse();
        assertThat(groupOne.hashCode()).isNotEqualTo(groupTwo.hashCode());

        groupTwo.first = 2;
        groupTwo.second = "second";
        groupTwo.third = 3.1f;
        groupTwo.fourth = 4.2;
        groupTwo.fifth = 5000L;
        groupTwo.sixth = 6;
        groupTwo.seventh = "seventh";
        assertThat(groupOne.equals(groupTwo)).isFalse();
        assertThat(groupOne.hashCode()).isNotEqualTo(groupTwo.hashCode());

        groupTwo.first = 1;
        groupTwo.second = "second";
        groupTwo.third = 3.2f;
        groupTwo.fourth = 4.2;
        groupTwo.fifth = 5000L;
        groupTwo.sixth = 6;
        groupTwo.seventh = "seventh";
        assertThat(groupOne.equals(groupTwo)).isFalse();
        assertThat(groupOne.hashCode()).isNotEqualTo(groupTwo.hashCode());

        groupTwo.first = 1;
        groupTwo.second = "second";
        groupTwo.third = 3.1f;
        groupTwo.fourth = 4.3;
        groupTwo.fifth = 5000L;
        groupTwo.sixth = 6;
        groupTwo.seventh = "seventh";
        assertThat(groupOne.equals(groupTwo)).isFalse();
        assertThat(groupOne.hashCode()).isNotEqualTo(groupTwo.hashCode());

        groupTwo.first = 1;
        groupTwo.second = "second";
        groupTwo.third = 3.1f;
        groupTwo.fourth = 4.2;
        groupTwo.fifth = 5001L;
        groupTwo.sixth = 6;
        groupTwo.seventh = "seventh";
        assertThat(groupOne.equals(groupTwo)).isFalse();
        assertThat(groupOne.hashCode()).isNotEqualTo(groupTwo.hashCode());

        groupTwo.first = 1;
        groupTwo.second = "second";
        groupTwo.third = 3.1f;
        groupTwo.fourth = 4.2;
        groupTwo.fifth = 5000L;
        groupTwo.sixth = 7;
        groupTwo.seventh = "seventh";
        assertThat(groupOne.equals(groupTwo)).isFalse();
        assertThat(groupOne.hashCode()).isNotEqualTo(groupTwo.hashCode());

        groupTwo.first = 1;
        groupTwo.second = "second";
        groupTwo.third = 3.1f;
        groupTwo.fourth = 4.2;
        groupTwo.fifth = 5000L;
        groupTwo.sixth = 6;
        groupTwo.seventh = "not_seventh";
        assertThat(groupOne.equals(groupTwo)).isFalse();
        assertThat(groupOne.hashCode()).isNotEqualTo(groupTwo.hashCode());
    }
}