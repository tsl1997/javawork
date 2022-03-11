public class ClassJob2 {
	public static void main(String[] args) {
		/*
		for (int i =100;i<1000;i++){
			int geWei = i%10;//取个位
			int baiWei = i/100;//取百位
			int shiWei = i/10%10;//取十位
			//判断是否为水仙花
			boolean isOk = geWei*geWei*geWei+baiWei*baiWei*baiWei+shiWei*shiWei*shiWei==i;
			if (isOk){
				System.out.println(i);
			}
		}
		*/
		int i = 100;
		do {
			int geWei = i%10;//取个位
			int baiWei = i/100;//取百位
			int shiWei = i/10%10;//取十位
			//判断是否为水仙花
			boolean isOk = geWei*geWei*geWei+baiWei*baiWei*baiWei+shiWei*shiWei*shiWei==i;
			if (isOk){
				System.out.println(i);
			}
			i++;
		}while (i<1000);
	}
}
