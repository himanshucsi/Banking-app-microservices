CREATE TABLE [user]
(
    [id]                    [bigint] NOT NULL IDENTITY(1,1),
    [auth_id] 				[varchar](255) DEFAULT NULL,
    [identification]        [varchar](255) DEFAULT NULL,
	[status]   			    [varchar](30) NOT NULL,
	CONSTRAINT [u_id] PRIMARY KEY CLUSTERED
	(
		[id] ASC
	)
);