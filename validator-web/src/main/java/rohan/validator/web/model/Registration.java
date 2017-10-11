package rohan.validator.web.model;

import rohan.validator.web.validators.CheckCandidate;

public class Registration {

	@CheckCandidate
	private Candidate candidate;

	public Candidate getCandidate() {
		return candidate;
	}

	public void setCandidate(Candidate candidate) {
		this.candidate = candidate;
	}
}
