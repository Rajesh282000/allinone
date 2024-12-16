package Codevita.Tcs;import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Point {
    int x;
    int y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class MaxThiefTime {

    static class CustomQueue {
        Point[] array;
        int front;
        int rear;

        CustomQueue(int size) {
            array = new Point[size];
            front = -1;
            rear = -1;
        }

        boolean isEmpty() {
            return front == -1;
        }

        void enqueue(Point p) {
            if (isEmpty()) {
                front = 0;
                rear = 0;
            } else {
                rear++;
            }
            array[rear] = p;
        }

        Point dequeue() {
            Point p = array[front];
            if (front == rear) {
                front = -1;
                rear = -1;
            } else {
                front++;
            }
            return p;
        }
    }

    static int max(int a, int b) {
        return (a > b) ? a : b;
    }

    static int bfs(int m, int n, int[][] fortress, int[][] directions) {
        boolean[][] visited = new boolean[m][n];
        int[][] distance = new int[m][n];
        CustomQueue q = new CustomQueue(m * n);

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                distance[i][j] = 0;
            }
        }

        Point start = new Point(0, 0);
        q.enqueue(start);
        visited[0][0] = true;

        while (!q.isEmpty()) {
            Point p = q.dequeue();
            for (int[] dir : directions) {
                int nx = p.x + dir[0];
                int ny = p.y + dir[1];
                if (nx >= 0 && nx < m && ny >= 0 && ny < n && !visited[nx][ny] && fortress[nx][ny] == 0) {
                    distance[nx][ny] = distance[p.x][p.y] + 1;
                    visited[nx][ny] = true;

                    Point newPoint = new Point(nx, ny);
                    q.enqueue(newPoint);
                }
            }
        }

        return distance[m - 1][n - 1];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();

        int[][] fortress = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                fortress[i][j] = scanner.nextInt();
            }
        }
        scanner.close();

        int[][] directions = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};

        int maxTime = 0;
        int[][] tempFortress = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (fortress[i][j] == 0) {
                    tempFortress = new int[m][n];
                    for (int k = 0; k < m; k++) {
                        System.arraycopy(fortress[k], 0, tempFortress[k], 0, n);
                    }

                    tempFortress[i][j] = 1;
                    int distance = bfs(m, n, tempFortress, directions);
                    maxTime = max(maxTime, distance);
                }
            }
        }

        System.out.println(maxTime + 1);
    }
}
