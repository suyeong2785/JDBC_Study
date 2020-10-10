package com.sbs.example.textboard;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		List<Article> articles = new ArrayList<>();
		
		int lastArticleId = 0;
		
		while(true) {
			
			System.out.printf("명령어) ");
			String cmd = scanner.nextLine();
			cmd = cmd.trim();
			
			if(cmd.equals("article add")) {	
				int id = lastArticleId + 1;
				System.out.println("== 게시물 생성 ==");
				
				System.out.printf("제목 : ");
				String title = scanner.nextLine();
				System.out.printf("내용 : ");
				String body = scanner.nextLine();
				
				Article article = new Article(id,title, body);
//				System.out.println(article);
				articles.add(article);
				lastArticleId++;
				
				System.out.printf("%d번 게시물이 저장되었습니다.\n",id);	
				continue;
				
			} else if(cmd.equals("article list")) {	
				
				if(articles.size() == 0) {
					System.out.println("게시물이 존재하지 않습니다.");
					continue;
				}
				
				System.out.println("== 게시물 리스트==");
				
				System.out.println("번호 / 제목");

				for( Article article: articles) {
					System.out.printf("%d / %s\n",article.id, article.title);
				}
				
				continue;
				
			} else if(cmd.equals("system exit")) {	
				System.out.println("== 프로그램 종료 ==");
				break;
			}
		}
	}
}
