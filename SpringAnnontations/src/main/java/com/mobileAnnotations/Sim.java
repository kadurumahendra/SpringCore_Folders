package com.mobileAnnotations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("sims")
public class Sim {
		
		@Value("Jio")
		private String provider;
		@Value("5G")
		private String type;
		
		
		public Sim() {
			super();
		}


		@Override
		public String toString() {
			return "Sim [provider=" + provider + ", type=" + type + "]";
		}
		
		
		
		
		

	


}
