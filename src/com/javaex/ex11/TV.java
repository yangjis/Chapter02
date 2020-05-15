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
		if(power == true) {
			this.power = power;
			System.out.println("tv를 켰습니다.");
		}else {
			this.power = power;
			System.out.println("tv 껐습니다.");
		}
	}
	
	public void channel(int channel) {
		if(channel > 0 && channel < 256 ) {
			System.out.println("지금 체널은" + this.channel + "번 입니다.");
		}else {
			this.channel = 7;
			System.out.println("사용할 수 없는 채널입니다.");
			System.out.println("지금 채널은 " + this.channel+ "번 입니다.");
		}
	}
	public void channel(boolean up) {
		if(this.channel > 0 && this.channel < 256) {
			if(up == true){
				System.out.println("채널을 올립니다.");
				this.channel ++;
				System.out.println("지금 채널은 " + this.channel + "번 입니다.");
			}else {
				System.out.println("채널을 내립니다.");
				this.channel--;
				System.out.println("지금 채널은 " + this.channel + "번 입니다.");
			}
		}else {
			System.out.println("채널을 올릴 수 없습니다.");
			this.channel = 7;
			System.out.println("지금 채널은 " + this.channel + "번 입니다.");
		}
	}
	public void volume(int volume) {
		if(volume > 0 && volume < 101) {
			this.volume = volume;
			System.out.println("현재 볼륨은 " + this.volume + " 입니다.");
		}else {
			System.out.println("더이상 볼륨을 높일 수 없습니다.");
			this.volume = 20;
			System.out.println("현재 볼륨은 " + this.volume + " 입니다.");
		}
	}
	public void volume(boolean up) {
		if(volume > 0 && volume <101) {
			System.out.println("볼륨을 올립니다.");
			volume ++;
			System.out.println("현재 볼륨은 " + volume + " 입니다.");
		}else {
			System.out.println("볼륨을 올릴 수 없습니다.");
			volume = 20;
			System.out.println("현재 볼륨은 " + volume + " 입니다.");
		}
	}
	
	public void status() {
		if(power == true) {
			System.out.println("티비는 켜있습니다." + "/볼륨: " + volume+ "/ 채널: " + channel);
		}else {
			System.out.println("티비는 꺼져있습니다." + "/볼륨: " + volume+ "/ 채널: " + channel);
		}
	}
	

}
