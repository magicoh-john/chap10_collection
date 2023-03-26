package com.javalab.collection.pkg18_스레드후학습;

import java.util.Vector;
/**
 * Vector :
 *  Multi-Thread에서 동시에 접근 불가능함.
 *  동기화된 메소드로 구성되어 있다.
 *  - 하나의 스레드에서 Vector를 사용하고 있을 경우 다른 스레드가 기다렸다
 *    그 작업이 끝나면 그 때 작업 시작한다.
 *    이 예제에서는 정수의 Vector를 만들고 여기에 100개의 요소를 추가한 다음 두 개의 스레드를 만듭니다. 
 *    첫 번째 스레드는 Vector에서 처음 50개의 요소를 제거하고 두 번째 스레드는 Vector에 50개의 새 요소를 추가합니다. 
 *    두 스레드를 동시에 시작한 다음 join() 메서드를 사용하여 두 스레드가 완료될 때까지 기다립니다. 
 *    마지막으로 Vector의 내용을 인쇄합니다.
 *    벡터는 스레드로부터 안전하므로 문제 없이 이 예제를 실행할 수 있습니다. 두 스레드는 데이터 불일치나 손상 없이 
 *    Vector에 동시에 액세스하고 수정할 수 있습니다. 동시 수정으로 인해 데이터 불일치 또는 손상이 발생할 수 있는
 *    ArrayList와 같은 스레드로부터 안전하지 않은 컬렉션의 경우에는 그렇지 않습니다.
 *  
 */
public class VectorThreadSafeExample {
    public static void main(String[] args) {
        // Vector 생성
        Vector<Integer> vector = new Vector<Integer>();

        // 벡터에 요소 추가
        for (int i = 0; i < 100; i++) {
            vector.add(i);	//  i가 자동 박싱(int type -> Integer type)
        }

        // 벡터에서 50미만 데이터 삭제(Create a new Thread that removes elements from the Vector)
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 50; i++) {
                    vector.remove(i);
                }
            }
        });

        // 벡터에 100~149까지 추가(Create a new Thread that adds elements to the Vector)
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 100; i < 150; i++) {
                    vector.add(i);
                }
            }
        });

        // 양쪽 스레드 시작 Start
        thread1.start();
//        thread2.start();
//
//        // 양쪽 스레드가 완료될 때까지 대기(Wait for both Threads to complete)
        try {
            thread1.join(); // 첫번째 스레드 종료시까지 대기
//            thread2.join(); // 두번째 스레드 종료시까지 대기
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // 벡터의 내용 출력(Print the contents of the Vector)
        System.out.println("Vector elements: " + vector);
    }
}
