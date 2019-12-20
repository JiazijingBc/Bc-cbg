class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        if not matrix: return []
        i,j = 0,-1
        hang_flag = 0
        lie_flag = 0
        ans = []
        hang_qianbiao = 1
        lie_qianbiao  = 0
        hang_weibiao = len(matrix) - 1
        lie_weibiao = len(matrix[0]) -1
        for _ in range(len(matrix) * len(matrix[0])):
            if hang_flag == 0 and lie_flag == 0:
                j += 1
                ans.append(matrix[i][j])
                if j == lie_weibiao:
                    lie_weibiao -= 1
                    hang_flag = 1
            elif hang_flag == 1 and lie_flag == 0:
                i += 1
                ans.append(matrix[i][j])
                if i == hang_weibiao:
                    hang_weibiao -= 1
                    lie_flag = 1
            elif hang_flag == 1 and lie_flag == 1:
                j -= 1
                ans.append(matrix[i][j])
                if j == lie_qianbiao:
                    lie_qianbiao += 1
                    hang_flag = 0
            elif hang_flag == 0 and lie_flag == 1:
                i -= 1
                ans.append(matrix[i][j])
                if i == hang_qianbiao:
                    hang_qianbiao += 1
                    lie_flag = 0
        return ans