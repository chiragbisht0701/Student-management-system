package com.vityarthi.sms;

import com.vityarthi.sms.model.Student;
import com.vityarthi.sms.util.Validator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ValidatorTest {
    @Test
    void acceptsValidStudent() {
        assertDoesNotThrow(() -> Validator.validate(new Student(1, "Asha", 20, "asha@example.com", 85)));
    }

    @Test
    void rejectsInvalidMarks() {
        assertThrows(IllegalArgumentException.class,
                () -> Validator.validate(new Student(1, "Asha", 20, "asha@example.com", 120)));
    }
}
