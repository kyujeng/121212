package study;

import java.util.Arrays;
import java.util.Collections;

public class One {
	/*
	 * 일단 이클립스와 연동부터 해결 좀 합시다... ㅠ
	 * 
	 * */
	    public String solution(String s) {
	        Character[] chars = new Character[s.length()];
	        for (int i = 0; i < s.length(); i++) {
	            chars[i] = s.charAt(i);
	        }
	        // 배열을 내림차순으로 정렬
	        Arrays.sort(chars, Collections.reverseOrder());
	        // 정렬된 배열을 문자열로 변환
	        StringBuilder sb = new StringBuilder(chars.length);
	        for (Character c : chars) {
	            sb.append(c);
	        }
	        return sb.toString();
	    }
	}
