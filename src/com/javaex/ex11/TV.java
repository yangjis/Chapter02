package com.javaex.ex11;

//tv만들기 문제

public class TV {
	
	private int channel = 7;
	private int volume = 20;
	private boolean power = false;
	
	public TV() {}
	public TV(int channel, int volume, boolean power) {
		this.channel = channel;
		this.volume = volume;
		this.power = power;
	}
	public TV(boolean power) {
		this.power = power;
	}
	public TV(int channel, int volume) {
		this.channel = channel;
		this.volume = volume;
	}
	
	
	public int getChannel() {
		return channel;
	}
	
	public int getVolume() {
		return volume;
	}
	
	public boolean Power() {
		return power;
	}
	
	public void power(boolean power) {
		if(power) {
			this.power = power;
			System.out.println("tv를 켰습니다.");
		}else {
			this.power = power;
			System.out.println("tv를 껐습니다.");
		}
	}
	
	public void channel(int channel) {
		if(channel > 0 && channel < 256 ) {
			this.channel = channel;
			System.out.println("지금 체널은" + this.channel + "번 입니다.");
		}else {
			System.out.println("사용할 수 없는 채널입니다.");
		}
	}
	public void channel(boolean up) {
		if(up){
			channel(this.channel + 1);
			System.out.println("채널을 올립니다.");
			this.channel ++;
		}else {
			channel(this.channel + 1);
			System.out.println("채널을 내립니다.");
			this.channel--;
		}
	}
	public void volume(int volume) {
		if(volume > 0 && volume < 101) {
			this.volume = volume;
			System.out.println("현재 볼륨은 " + this.volume + " 입니다.");
		}else {
			System.out.println("더이상 볼륨을 높일 수 없습니다.");
		}
	}
	public void volume(boolean up) {
			if(up) {
				volume(this.volume + 1);
				System.out.println("볼륨을 올립니다.");
				this.volume++;
			}else {
				volume(this.volume + 1);
				System.out.println("볼륨을 내립니다.");
				this.volume--;
			}
	}
	
	public void status() {
		if(power) {
			System.out.println("티비는 켜있습니다." + "/볼륨: " + volume+ "/ 채널: " + channel);
		}else {
			System.out.println("티비는 꺼져있습니다." + "/볼륨: " + volume+ "/ 채널: " + channel);
		}
	}
	

}
