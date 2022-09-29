CREATE TABLE [fund_transfer]
(
    [id]                    [bigint] NOT NULL IDENTITY(1,1),
    [transaction_reference] [varchar](255) DEFAULT NULL,
    [from_account]          [varchar](255) DEFAULT NULL,
    [to_account] 			[varchar](255) DEFAULT NULL,
    [amount]                [decimal](19, 2) DEFAULT NULL,
	[status]    			[varchar](30) NOT NULL,
	CONSTRAINT [ft_id] PRIMARY KEY CLUSTERED
	(
		[id] ASC
	)
);