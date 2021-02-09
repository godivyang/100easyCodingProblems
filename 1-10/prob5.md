# **Implement strStr()**

#### [_(from leetcode)_](https://leetcode.com/problems/implement-strstr/)

### Implement strStr().  
### Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

### **Clarification:**
> **_What should we return when needle is an empty string? This is a great question to ask during an interview._  
For the purpose of this problem, we will return 0 when needle is an empty string. This is consistent to C's strstr() and Java's indexOf().**

---
| **Examples**        | 1       | 2       | 3  |
|---------------------|---------|---------|----|
| **Input: haystack** | "hello" | "aaaaa" | "" |
| **Input: needle**   | "ll"    | "bba"   | "" |
| **Output:**         | 2       | -1      | 0  |

---
## **Constraints:**
**0 <= haystack.length, needle.length <= 5 * 104  
haystack and needle consist of only lower-case English characters.**
