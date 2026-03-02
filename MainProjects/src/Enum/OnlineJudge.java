package Enum;

enum Verdict
{
	
//	protected int code;
	
	ACCEPTED,
	WRONG_ANSWER,
	TIME_LIMIT_EXCEEDED,
	COMPILATION_ERROR,
	SEGMENTATION_FAULT,
	MEMORY_LIMIT_EXCEEDED,
	IDLENESS_LIMIT_EXCEEDED,
	IN_QUEUE
	
	int Verdict(int code)
	{
		this.code=code;
		return code;
	}
	
}

public class OnlineJudge 
{	
	
	public String submissionId;
	public Verdict verdict;
	
	OnlineJudge()
	{
		submissionId="0000";
		verdict=Verdict.IN_QUEUE;
	}
	
	OnlineJudge(String submissionId,Verdict verdict)
	{
		
	}
	
}
