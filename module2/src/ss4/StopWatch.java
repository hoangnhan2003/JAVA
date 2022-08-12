package ss4;
import java.time.LocalTime;
public class StopWatch {
    private LocalTime startTime;
    private LocalTime endTime;

    public StopWatch(LocalTime startTime, LocalTime endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalTime startTime) {
        this.startTime = startTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalTime endTime) {
        this.endTime = endTime;
    }

    public void start() {
        this.startTime = LocalTime.now();
    }

    public void stop() {
        this.endTime = LocalTime.now();
    }

    public int getElapsedTime() {
        return ((endTime.getHour() - startTime.getHour()) * 3600 + (endTime.getMinute() - startTime.getMinute()) * 60 + (endTime.getSecond() - startTime.getSecond()))*1000;
    }

    public static void selectionSort(int arr[]) {
//        int n = arr.length;
//
//        // Duyệt qua từng phần tử của mảng
//        for (int i = 0; i < n - 1; i++) {
//
//            // Tìm phần tử nhỏ nhất trong mảng chưa được sắp xếp
//            int min_idx = i;
//            for (int j = i + 1; j < n; j++)
//                if (arr[j] < arr[min_idx])
//                    min_idx = j;
//
//            // Hoán đổi phần tử nhỏ nhất và phần tử đầu tiên
//            int temp = arr[min_idx];
//            arr[min_idx] = arr[i];
//            arr[i] = temp;
//        }
//        for (int i = 0; i < arr.length-1; i++) {
//            for (int j = i+1; j < arr.length; j++) {
//                if(arr[i] > arr[j]){
//                    int temp = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] =temp;
//                }
//            }
//        }
        // Sap xep chen
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            // Di chuyển các phần tử của arr [0 ... i - 1], lớn hơn key
            // đến một vị trí trước vị trí hiện tại của chúng
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[110000];
        for (int i = 0; i < 110000; i++) {
            arr[i] = (int) Math.floor(Math.random() * 1000);
        }
        LocalTime startTime = LocalTime.now();
        selectionSort(arr);
        LocalTime endTime = LocalTime.now();
        StopWatch sw = new StopWatch(startTime,endTime);
        System.out.println("Time to finished : " + sw.getElapsedTime() + "ms");

    }
}

