import java.util.ArrayDeque;
import java.util.Deque;

public class Solution {
	public int solution(String S) {
//		if (S.length() == 0)
//			return 1;

//		if (S.length() % 2 !=0)
//			return 0;

		Deque<Character> dq = new ArrayDeque<>();
		char[] arr = S.toCharArray();
		for (int i = 0; i < arr.length; i++) {
			char c = arr[i];
			switch (c) {
				case '(':
				case '{':
				case '[':
					dq.push(c);
				break;

				case ')':
				case '}':
				case ']':
					Character c2 = dq.pollFirst();
					if (
							!(c == ')' && c2 == '('
						|| c == '}' && c2 == '{'
						|| c == ']' && Character.compare(c2,'[') == 0)
					)
						return 0;
					break;
			}
		}

		return 1;
	}
}
