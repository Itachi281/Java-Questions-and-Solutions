/**
 * 
 * @desc Bob has a playlist of songs, each song has a singer associated with it (denoted by an integer)
 *       Favourite singer of Bob is the one whose songs are the most on the playlist
 *       Count the number of Favourite Singers of Bob
 */

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read the number of elements
        int n = sc.nextInt();
        
        // Create a list to store the elements
        List<Long> a = new ArrayList<>(n);
        
        // Create a map to store the frequency of each element
        Map<Long, Integer> m = new HashMap<>();
        
        // Read the elements and populate the map with their frequencies
        for (int i = 0; i < n; i++) {
            long element = sc.nextLong();
            a.add(element);
            m.put(element, m.getOrDefault(element, 0) + 1);
        }
        
        int cnt = 0;
        int mx = 0;
        
        // Iterate over the map to find the maximum frequency and its count
        for (Map.Entry<Long, Integer> entry : m.entrySet()) {
            if (entry.getValue() == mx) {
                cnt++;
            }
            if (entry.getValue() > mx) {
                mx = entry.getValue();
                cnt = 1;
            }
        }
        
        // Print the result
        System.out.println(cnt);
        
        // Close the scanner
        sc.close();
    }
}
