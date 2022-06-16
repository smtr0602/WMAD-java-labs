package oop.nestedClasses.localInnerClass;

public class Door {

	public boolean isLocked() {

		// inner class
		class Lock {

			private String key = "mydoorkey";

			public boolean isLocked(String key) {
				if (key.equals(this.key)) {
					return false;
				}
				return true;
			}

		}
		return new Lock().isLocked("abc123");
	}

}
