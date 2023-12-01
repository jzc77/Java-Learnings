package JUnit.jc;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

//@RunWith(MockitoJUnitRunner.class)
@ExtendWith(MockitoExtension.class)
class ClassATest {

    @Mock
    ClassB classB;

    @InjectMocks
    ClassA classA;

    @Test
    public void testPerformOperation() {
        // Define behavior for ClassB
        when(classB.processData(anyInt())).thenReturn(10);

        // Perform the operation
        int result = classA.performOperation(classB, 7);

        // Verify interactions and captured arguments
        verify(classB).processData(7);

        // Assert the result
        assertEquals(15, result);
    }

}