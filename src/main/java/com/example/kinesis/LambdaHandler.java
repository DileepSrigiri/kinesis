package com.example.kinesis;

import org.springframework.beans.factory.annotation.Autowired;

import com.amazonaws.regions.Region;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClient;
import com.amazonaws.services.dynamodbv2.document.DynamoDB;
import com.amazonaws.services.dynamodbv2.document.PutItemOutcome;
import com.amazonaws.services.dynamodbv2.model.PutItemRequest;
import com.amazonaws.services.dynamodbv2.model.PutItemResult;
import com.amazonaws.services.dynamodbv2.model.PutRequest;
import com.amazonaws.services.kinesis.AmazonKinesis;
import com.amazonaws.services.kinesis.AmazonKinesisClient;
import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.amazonaws.services.lambda.runtime.events.KinesisEvent;


public class LambdaHandler implements RequestHandler<KinesisEvent,String> {

	private DynamoDB dynamoDb;
	private String DYNAMODB_TABLE_NAME = "UnicornSensorData";
	private Regions REGION = Regions.US_EAST_1;

	@Autowired
	private AmazonKinesis kinesis;

	@Autowired
	private AmazonDynamoDB amazonDynamoDB;
	@Override
	public String handleRequest(KinesisEvent kinesisEvent, Context context) {
		kinesisEvent.getRecords().stream().ma
		PutRequest request;
		request.
		for(KinesisEvent.KinesisEventRecord record:kinesisEvent.getRecords()) {
		 byte[]	 data = record.getKinesis().getData().array();
			JSONObject testV=new JSONObject(new String(responseBody));
		}

		return null;
	}

	private PutItemResult persisitData(PutRequest request) {

	}

	public AmazonKinesis getKinesis() {
		return kinesis;
	}

	public void setKinesis(AmazonKinesis kinesis) {
		this.kinesis = kinesis;
	}

	public AmazonDynamoDB getAmazonDynamoDB() {
		return amazonDynamoDB;
	}

	public void setAmazonDynamoDB(AmazonDynamoDB amazonDynamoDB) {
		this.amazonDynamoDB = amazonDynamoDB;
	}
}
