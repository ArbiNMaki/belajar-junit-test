package belajar.test.junit.test;

import org.junit.jupiter.api.*;

import java.util.LinkedList;
import java.util.Queue;

@DisplayName("A Queue")
public class QueueTest {
    private Queue<String> queue;

    @Nested
    @DisplayName("When new")
    public class WhenNew {

        @BeforeEach
        public void setUp() {
            queue = new LinkedList<>();
        }

        @Test
        @DisplayName("When offer, size must be 1")
        void offerNewData() {
            queue.offer("Arbi");
            Assertions.assertEquals(1, queue.size());
        }

        @Test
        @DisplayName("When offer 2 data, size must be 2")
        void offerMoreData() {
            queue.offer("Arbi");
            queue.offer("Kalista");
            Assertions.assertEquals(2, queue.size());
        }

    }
}
