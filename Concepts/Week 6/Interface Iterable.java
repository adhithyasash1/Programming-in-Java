/*
Interface Iterable<T>

Implementing this interface allows an object to be the target of the "foreach" statement.

Type Parameters:
	T - the type of elements returned by the iterator

All Known Subinterfaces:
	BeanContext, BeanContextServices, BlockingDeque<E>, BlockingQueue<E>, Collection<E>, 
	Deque<E>, DirectoryStream<T>, List<E>, NavigableSet<E>, Path, Queue<E>, 
	SecureDirectoryStream<T>, Set<E>, SortedSet<E>, TransferQueue<E>

All Known Implementing Classes:
	AbstractCollection, AbstractList, AbstractQueue, AbstractSequentialList, 
	AbstractSet, ArrayBlockingQueue, ArrayDeque, ArrayList, AttributeList, 
	BatchUpdateException, BeanContextServicesSupport, BeanContextSupport, 
	ConcurrentLinkedDeque, ConcurrentLinkedQueue, ConcurrentSkipListSet, 
	CopyOnWriteArrayList, CopyOnWriteArraySet, DataTruncation, DelayQueue, 
	EnumSet, HashSet, JobStateReasons, LinkedBlockingDeque, LinkedBlockingQueue, 
	LinkedHashSet, LinkedList, LinkedTransferQueue, PriorityBlockingQueue, 
	PriorityQueue, RoleList, RoleUnresolvedList, RowSetWarning, SerialException,
	ServiceLoader, SQLClientInfoException, SQLDataException, SQLException, 
	SQLFeatureNotSupportedException, SQLIntegrityConstraintViolationException, 
	SQLInvalidAuthorizationSpecException, SQLNonTransientConnectionException, 
	SQLNonTransientException, SQLRecoverableException, SQLSyntaxErrorException, 
	SQLTimeoutException, SQLTransactionRollbackException, SQLTransientConnectionException, 
	SQLTransientException, SQLWarning, Stack, SyncFactoryException, 
	SynchronousQueue, SyncProviderException, TreeSet, Vector
*/

public interface Iterable<T>

Iterator<T> iterator()

/*
Method Detail :

iterator

Iterator<T> iterator()
	Returns an iterator over a set of elements of type T.
Returns:
	an Iterator.
*/