package inheritance;

public class InheritanceTest2 {

	class Sports {
		int players;
		String name, condition;
		
		Sports(int np, String name, String cond) {
			players = np;
			this.name = name;
			condition = cond;
		}
	}
	
	//需要有Football(int, String, String)的constructor或是呼叫super
//	class Football extends Sports {
//		int umpires;
//		int subtitutes;
//		Football() {
//			super.condition = "OK";
//			super.name = "Football";
//			super.players = 11;
//			umpires = 11;
//			subtitutes = 2;
//		}
//	}
	
	class FootballA extends Sports {
		int umpires;
		int subtitutes;
		FootballA() {
			super(11, "Football", "OK");
			this.umpires = 3;
			this.subtitutes = 2;
		}
	}
	
	interface ijk {}
	ijk ii = new ijk() {};
}
