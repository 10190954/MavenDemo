package cn.itcast.mockito;
import static org.mockito.Mockito.*;

import java.util.List;

public class MockStub {
    public static void main() {
       List mockedList = mock(List.class);
       
       mockedList.add("one");
       mockedList.clear();
       mockedList.add("3");
       verify(mockedList).add("one");
    }
}
