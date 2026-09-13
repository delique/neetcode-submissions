class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:

        numbers = {}

        for number in nums:
            if number in numbers:
                numbers[number] += 1
            else:
                numbers[number] = 1

        for key, value in numbers.items():
            if value > 1:
                return True

        return False