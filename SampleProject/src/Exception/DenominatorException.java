package Exception;

	public class DenominatorException extends Exception {

		public DenominatorException() {
		}

		public DenominatorException(String message) {
			super(message);
		}

		public DenominatorException(Throwable cause) {
			super(cause);
		}

		public DenominatorException(String message, Throwable cause) {
			super(message, cause);
		}

		public DenominatorException(String message, Throwable cause, boolean enableSuppression,
				boolean writableStackTrace) {
			super(message, cause, enableSuppression, writableStackTrace);
		}

	}


