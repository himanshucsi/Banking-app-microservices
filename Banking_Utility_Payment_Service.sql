CREATE TABLE [utility_payment]
(
    [id]                    [bigint] NOT NULL IDENTITY(1,1),
	[provider_id]           [bigint] NULL, 
	[amount]                [decimal](19, 2) DEFAULT NULL,
    [reference_number] 		[varchar](255) DEFAULT NULL,
    [account]          		[varchar](255) DEFAULT NULL,
    [transaction_id] 		[varchar](255) DEFAULT NULL, 
	[status]    			[varchar](30) NOT NULL,
	CONSTRAINT [up_id] PRIMARY KEY CLUSTERED
	(
		[id] ASC
	)
);