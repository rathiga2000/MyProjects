package ThisSuper;


	public class TwelthStudent  extends TenthStudent{

		private int tamil;
		private int maths;
		private int english;

		void setTamil(int tamil) {
			this.tamil = tamil;
		}

		void setEnglish(int english) {
			this.english = english;
		}

		void setMaths(int maths) {
			this.maths = maths;
		}

		int getEnglish() {
			return english;
		}

		int getTamil() {
			return tamil;
		}

		int getMaths() {
			return maths;
		}

		//int tenthTotal() {
			//return getMaths() + getTamil() + getEnglish();
		//}
		int twelthTotal()
		{
			return getMaths() + getTamil() + getEnglish();
		}
		
		int tenthPercentage() {
		    return super.percentage();
		}
		int twelthPercentage() {
			   
			   return total()/6 ; // 262/600 43+super.perr 262/3 =87.
		   }

	}


