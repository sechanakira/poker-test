package io.advance.poker.model;

public class GameResultDto extends GameDto {
	private String evaluation;

	public String getEvaluation() {
		return this.evaluation;
	}

	public void setEvaluation(final String evaluation) {
		this.evaluation = evaluation;
	}
}
