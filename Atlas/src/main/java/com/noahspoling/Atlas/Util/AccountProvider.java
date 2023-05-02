package Atlas.Util;

import com.usthe.sureness.provider.SurenessAccount;
import com.usthe.sureness.provider.SurenessAccountProvider;

import javax.sql.DataSource;

public class AccountProvider implements SurenessAccountProvider {
    private final DataSource dataSource;

    public AccountProvider(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public SurenessAccount loadAccount(String arg0) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'loadAccount'");
    }

    
}
