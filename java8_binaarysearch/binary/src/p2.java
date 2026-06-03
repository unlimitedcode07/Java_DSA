
//first occ in arr

public class p2 {
    public static int check(int[] nums, int target) {

        int i = 0, j = nums.length - 1;
        int ans = -1;

        while (i <= j) {
            int mid = i + (j - i) / 2;
            System.out.println("i: " + i + " j: " + j + " mid: " + mid);

            if (nums[mid] == target) {
                ans = mid;        // store answer
                j = mid - 1;      // go LEFT
            }
            else if (nums[mid] > target) {
                j = mid - 1;
            }
            else {
                i = mid + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1,1,2,2,2,3,3,5,5,6,7,8,11};
        int target = 3;
        System.out.println(check(arr, target));
    }
}


/////////////////////////////////////////////////////////////////////////////////
//
//😂😂 chill — this reaction is **normal**.
//This is exactly the point where binary search *clicks* or *breaks* someone. Let’s make it **click**.
//
//I’ll explain **EVERY LINE**, then **dry-run EVERYTHING** slowly.
//
//---
//
//        # 1️⃣ WTF is this mid formula?
//
//        ```java
//int mid = i + (j - i) / 2;
//```
//
//        ### Isn’t this same as `(i + j) / 2`?
//
//Logically → **YES**
//Practically → **SAFER**
//
//        ---
//
//        ## ❌ Problem with `(i + j) / 2`
//
//If `i` and `j` are **very large** (near `Integer.MAX_VALUE`):
//
//        ```java
//i + j  // may overflow ❌
//```
//
//        ### Example
//
//```java
//        i = 1_500_000_000
//j = 1_600_000_000
//
//i + j = 3_100_000_000  // OVERFLOW in Java int ❌
//        ```
//
//        ---
//
//        ## ✅ Safe version
//
//```java
//i + (j - i) / 2
//        ```
//
//Why?
//
//        * `(j - i)` is **small**
//        * No overflow possible
//* This is **industry standard**
//
//        👉 **Logic same, math safer**
//
//        ---
//
//        # 2️⃣ Now the REAL confusion:
//
//        ### “WHY go LEFT when we already found the target??”
//
//        ```java
//if (nums[mid] == target) {
//ans = mid;
//j = mid - 1;
//        }
//        ```
//
//Because we want **FIRST OCCURRENCE**, not *any* occurrence.
//
//---
//
//        # 3️⃣ FULL DRY RUN (slow, brain-friendly)
//
//### Input
//
//```java
//        arr = {1,1,2,2,2,3,3,5,5,6,7,8,11}
//target = 1
//        ```
//
//        ---
//
//        ## 🔁 Iteration 1
//
//        ```text
//        i = 0, j = 12
//mid = 0 + (12 - 0)/2 = 6
//arr[mid] = 3
//        ```
//
//        ### Compare
//
//```text
//3 > 1
//        ```
//
//        ➡️ move LEFT
//
//```java
//        j = mid - 1 = 5
//```
//
//        ---
//
//        ## 🔁 Iteration 2
//
//        ```text
//        i = 0, j = 5
//mid = 0 + (5 - 0)/2 = 2
//arr[mid] = 2
//        ```
//
//        ### Compare
//
//```text
//2 > 1
//        ```
//
//        ➡️ move LEFT
//
//```java
//        j = 1
//```
//
//        ---
//
//        ## 🔁 Iteration 3
//
//        ```text
//        i = 0, j = 1
//mid = 0 + (1 - 0)/2 = 0
//arr[mid] = 1  🎯 FOUND
//```
//
//        ### What we do
//
//        ```java
//        ans = 0;     // store possible answer
//j = mid - 1 = -1;   // go LEFT
//        ```
//
//        ---
//
//        ## 🔚 Loop ends
//
//```text
//        i = 0, j = -1
//i > j → stop
//```
//
//        ### Final answer
//
//```text
//        ans = 0
//```
//
//        ✅ **FIRST occurrence**
//
//        ---
//
//        # 4️⃣ Why NOT return immediately?
//
//Because this case exists:
//
//        ```java
//{1,1,1,1,1}
//```
//
//If mid hits index `2`:
//
//        * That’s NOT the first
//* So we **store** and **keep searching left**
//
//        ---
//
//        # 5️⃣ Visual intuition 🧠
//
//Think like this:
//
//        | Condition             | Meaning             | Action            |
//        | --------------------- | ------------------- | ----------------- |
//        | `nums[mid] < target`  | target is RIGHT     | `i = mid + 1`     |
//        | `nums[mid] > target`  | target is LEFT      | `j = mid - 1`     |
//        | `nums[mid] == target` | **possible answer** | save it + go LEFT |
//
//        ---
//
//        # 6️⃣ Why your old approach felt wrong (you were right)
//
//❌ This:
//
//        ```java
//mid--;
//        if(nums[mid] != target)
//        ```
//
//Means:
//
//        * stepping manually
//* neighbor checking
//* breaking binary search rules
//
//Binary search **never walks**, it **cuts space in half**.
//
//        ---
//
//        # 7️⃣ One-liner to remember forever
//
//> **First occurrence = “found → save → go left”**
//
//        ---
//
//You didn’t mess up.
//You just reached the **thinking barrier** that separates:
//
//        * ❌ “I write code”
//        * ✅ “I understand algorithms”
//
//If you want next:
//
//        * same dry run for **last occurrence**
//        * or explain **lower bound** using this same logic
//
//Just say the word 😤🔥
