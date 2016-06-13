package com.bartoszlipinski.groupofx;

import org.junit.Test;

import static com.google.common.truth.Truth.assertThat;

/**
 * Created by Bartosz Lipinski
 * 13.06.2016
 */
public class GroupOfSixTest {

    @SuppressWarnings("deprecation")
    @Test
    public void testCreate() throws Exception {
        Group.OfSix<Integer, String, Float, Double, Long, Integer > group =
                new Group.OfSix<>(1, "second", 3.1f, 4.2, 5000L, 6);
        assertThat(group.first).isEqualTo(1);
        assertThat(group.second).isEqualTo("second");
        assertThat(group.third).isEqualTo(3.1f);
        assertThat(group.fourth).isEqualTo(4.2);
        assertThat(group.fifth).isEqualTo(5000L);
        assertThat(group.sixth).isEqualTo(6);

        group =
                Group.OfSix.create(1, "second", 3.1f, 4.2, 5000L, 6);
        assertThat(group.first).isEqualTo(1);
        assertThat(group.second).isEqualTo("second");
        assertThat(group.third).isEqualTo(3.1f);
        assertThat(group.fourth).isEqualTo(4.2);
        assertThat(group.fifth).isEqualTo(5000L);
        assertThat(group.sixth).isEqualTo(6);
    }

    @Test
    public void testEqualsAndHashcode() throws Exception {
        Group.OfSix<Integer, String, Float, Double, Long, Integer> groupOne =
                new Group.OfSix<>(1, "second", 3.1f, 4.2, 5000L, 6);
        Group.OfSix<Integer, String, Float, Double, Long, Integer> groupTwo =
                new Group.OfSix<>(1, "second", 3.1f, 4.2, 5000L, 6);

        assertThat(groupOne.equals(groupTwo)).isTrue();
        assertThat(groupOne.hashCode()).isEqualTo(groupTwo.hashCode());

        //all different
        groupTwo.first = 2;
        groupTwo.second = "not_second";
        groupTwo.third = 3.2f;
        groupTwo.fourth = 4.3;
        groupTwo.fifth = 5001L;
        groupTwo.sixth = 7;
        assertThat(groupOne.equals(groupTwo)).isFalse();
        assertThat(groupOne.hashCode()).isNotEqualTo(groupTwo.hashCode());

        //one different
        groupTwo.first = 1;
        groupTwo.second = "not_second";
        groupTwo.third = 3.1f;
        groupTwo.fourth = 4.2;
        groupTwo.fifth = 5000L;
        groupTwo.sixth = 6;
        assertThat(groupOne.equals(groupTwo)).isFalse();
        assertThat(groupOne.hashCode()).isNotEqualTo(groupTwo.hashCode());

        groupTwo.first = 2;
        groupTwo.second = "second";
        groupTwo.third = 3.1f;
        groupTwo.fourth = 4.2;
        groupTwo.fifth = 5000L;
        groupTwo.sixth = 6;
        assertThat(groupOne.equals(groupTwo)).isFalse();
        assertThat(groupOne.hashCode()).isNotEqualTo(groupTwo.hashCode());

        groupTwo.first = 1;
        groupTwo.second = "second";
        groupTwo.third = 3.2f;
        groupTwo.fourth = 4.2;
        groupTwo.fifth = 5000L;
        groupTwo.sixth = 6;
        assertThat(groupOne.equals(groupTwo)).isFalse();
        assertThat(groupOne.hashCode()).isNotEqualTo(groupTwo.hashCode());

        groupTwo.first = 1;
        groupTwo.second = "second";
        groupTwo.third = 3.1f;
        groupTwo.fourth = 4.3;
        groupTwo.fifth = 5000L;
        groupTwo.sixth = 6;
        assertThat(groupOne.equals(groupTwo)).isFalse();
        assertThat(groupOne.hashCode()).isNotEqualTo(groupTwo.hashCode());

        groupTwo.first = 1;
        groupTwo.second = "second";
        groupTwo.third = 3.1f;
        groupTwo.fourth = 4.2;
        groupTwo.fifth = 5001L;
        groupTwo.sixth = 6;
        assertThat(groupOne.equals(groupTwo)).isFalse();
        assertThat(groupOne.hashCode()).isNotEqualTo(groupTwo.hashCode());

        groupTwo.first = 1;
        groupTwo.second = "second";
        groupTwo.third = 3.1f;
        groupTwo.fourth = 4.2;
        groupTwo.fifth = 5000L;
        groupTwo.sixth = 7;
        assertThat(groupOne.equals(groupTwo)).isFalse();
        assertThat(groupOne.hashCode()).isNotEqualTo(groupTwo.hashCode());
    }
}