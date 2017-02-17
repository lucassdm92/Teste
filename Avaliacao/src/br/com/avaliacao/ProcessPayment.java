package br.com.avaliacao;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.List;

import br.com.avalicao.vo.ProdutoVO;

public class ProcessPayment {

	private static List<ProdutoVO> ar = Arrays.asList(
				new ProdutoVO("Sabão em Pó", BigDecimal.valueOf(3.90), 100,LocalDate.of(2017, Month.JANUARY, 6)), 
				new ProdutoVO("Cadeira de Cozinha",  BigDecimal.valueOf(3.90), 300,LocalDate.of(2017, Month.APRIL, 29)), 
				new ProdutoVO("Açucar",  BigDecimal.valueOf(3.90), 888,LocalDate.of(2017, Month.OCTOBER, 23)),
				new ProdutoVO("NootBook Acer",  BigDecimal.valueOf(3.90), 35,LocalDate.of(2017, Month.DECEMBER, 1)), 
				new ProdutoVO("Som de Carro",  BigDecimal.valueOf(3.90), 67,LocalDate.of(2017, Month.SEPTEMBER, 15)), 
				new ProdutoVO("Jarra de Suco",  BigDecimal.valueOf(3.90), 34,LocalDate.of(2017, Month.FEBRUARY, 17)),
				new ProdutoVO("Alcatra",  BigDecimal.valueOf(3.90), 888,LocalDate.of(2000, Month.MARCH, 26)));

	public static void main(String args[]) {
		System.out.println("###### ORDENANDO POR PRODUTOR ######");
		
		ar.stream().sorted(
				(p1,p2) -> 
				p1.getProductName().compareTo(p2.getProductName()))
				.forEach(p -> System.out.print(
						"Nome produto: "+p.getProductName()+
						"\nQuantidade do produto: "+p.getAmountProduct()+
						"\nData do produto: "+p.getDate()+"\n\n\n")
						);
		
		System.out.println("###### ORDENANDO POR DATA ######");
		ar.stream().sorted(
				(p1,p2) -> 
				p1.getDate().compareTo(p2.getDate()))
				.forEach(p -> System.out.print(
						"Nome produto: "+p.getProductName()+
						"\nQuantidade do produto: "+p.getAmountProduct()+
						"\nData do produto: "+p.getDate()+"\n\n\n")
						);
		}
	
	


}
