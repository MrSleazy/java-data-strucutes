package com.personal;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class BasicStackTest {


    @Test
    void testPushAndPop() {

        BasicStack<String> stack = new BasicStack<String>();
        stack.push("myString1");
        stack.push("myString2");

        assertThat(stack.size()).isEqualTo(2);

        assertThat(stack.pop()).isEqualTo("myString2");
        assertThat(stack.pop()).isEqualTo("myString1");
        assertThat(stack.pop()).isNull();
        
        assertThat(stack.size()).isEqualTo(0);
    }

    @Test
    void testContains() {
        BasicStack<Integer> stack = new BasicStack<Integer>();
        stack.push(1);
        stack.push(1);
        stack.push(2);

        assertThat(stack.contains(2)).isTrue();
        assertThat(stack.contains(1)).isTrue();
        assertThat(stack.contains(3)).isFalse();

        // assert the actual stack is not modified;
        assertThat(stack.size()).isEqualTo(3);
    }

    @Test
    void testAccess() {
        BasicStack<Integer> stack = new BasicStack<Integer>();
        stack.push(1);
        stack.push(1);
        stack.push(2);
        stack.push(6);
        Integer found = stack.access(1);

        assertThat(found).isEqualTo(1);
        assertThat(stack.size()).isEqualTo(1);

        // Try to access item that has already been popped. 
        assertThat(stack.access(2)).isNull();
        assertThat(stack.size()).isEqualTo(0);
    }
}
