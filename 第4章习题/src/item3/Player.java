package item3;

public class Player {
	public void play(int index)throws NoThisSoundException{
		if(index>10){
			throw new NoThisSoundException("您播放的歌曲不存在"); 
			} 
		System.out.println("正在播放歌曲"); 
		} 
	} 
