import static org.junit.jupiter.api.Assertions.assertEquals;
import org.example.Solution;
import org.junit.jupiter.api.Test;

public class SolutionTest {

    @Test
    public void testFindDuplicate() {
        Solution solution = new Solution();

        int[] nums1 = {1, 3, 4, 2, 2};
        int expected1 = 2;
        int actual1 = solution.findDuplicate(nums1);
        assertEquals(expected1, actual1);

        int[] nums2 = {3, 1, 3, 4, 2};
        int expected2 = 3;
        int actual2 = solution.findDuplicate(nums2);
        assertEquals(expected2, actual2);

        int[] nums3 = {1, 1};
        int expected3 = 1;
        int actual3 = solution.findDuplicate(nums3);
        assertEquals(expected3, actual3);

        int[] nums4 = {2, 2, 2, 2, 2};
        int expected4 = 2;
        int actual4 = solution.findDuplicate(nums4);
        assertEquals(expected4, actual4);

        int[] nums5 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10};
        int expected5 = 10;
        int actual5 = solution.findDuplicate(nums5);
        assertEquals(expected5, actual5);

        int[] nums6 = {5, 2, 7, 9, 1, 6, 3, 8, 4, 10, 6};
        int expected6 = 6;
        int actual6 = solution.findDuplicate(nums6);
        assertEquals(expected6, actual6);

        int[] nums7 = {9, 8, 7, 6, 5, 4, 3, 2, 1, 9};
        int expected7 = 9;
        int actual7 = solution.findDuplicate(nums7);
        assertEquals(expected7, actual7);

        int[] nums8 = {2, 3, 4, 5, 2, 1};
        int expected8 = 2;
        int actual8 = solution.findDuplicate(nums8);
        assertEquals(expected8, actual8);

        int[] nums9 = {1, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int expected9 = 1;
        int actual9 = solution.findDuplicate(nums9);
        assertEquals(expected9, actual9);

        int[] nums10 = {4, 4, 4, 4, 4};
        int expected10 = 4;
        int actual10 = solution.findDuplicate(nums10);
        assertEquals(expected10, actual10);
    }
}