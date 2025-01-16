package org.example;

import org.junit.jupiter.api.Test;

public class ShapeDescriberTest {
    @Test
    public void testDescribe() {
        Shape rectangle = new Rectangle(5, 10, new Color(255, 0, 0, 255));
        ShapeDescriber describer = new ShapeDescriber();

        describer.describe(rectangle);
        // Testuje logi ręcznie lub przy pomocy frameworka logującego (np. LogCaptor)
    }
}
