package com.pixelplex.qtum.ui.fragment.SmartContractsFragment;

import com.pixelplex.qtum.R;
import com.pixelplex.qtum.ui.fragment.BackupContractsFragment.BackupContractsFragment;
import com.pixelplex.qtum.ui.fragment.BaseFragment.BaseFragmentPresenterImpl;
import com.pixelplex.qtum.ui.fragment.MyContractsFragment.MyContractsFragment;
import com.pixelplex.qtum.ui.fragment.ProfileFragment.SettingObject;
import com.pixelplex.qtum.ui.fragment.QStore.QStoreFragment;
import com.pixelplex.qtum.ui.fragment.RestoreContractsFragment.RestoreContractsFragment;
import com.pixelplex.qtum.ui.fragment.TemplatesFragment.TemplatesFragment;
import com.pixelplex.qtum.ui.fragment.WatchContractFragment.WatchContractFragment;

import java.util.ArrayList;
import java.util.List;


class SmartContractsFragmentPresenterImpl extends BaseFragmentPresenterImpl implements SmartContractsFragmentPresenter {

    private SmartContractsFragmentView mSmartContractsFragmentView;

    private List<SettingObject> settingsData;

    SmartContractsFragmentPresenterImpl(SmartContractsFragmentView smartContractsFragmentView){
        mSmartContractsFragmentView = smartContractsFragmentView;
        initSettingsData();
    }

    private void initSettingsData() {
        settingsData = new ArrayList<>();
        settingsData.add(new SettingObject(R.string.my_new_contracts,R.drawable.ic_my_new_contracts,0));
        settingsData.add(new SettingObject(R.string.my_published_contracts,R.drawable.ic_my_publiched_contracts,0));
        settingsData.add(new SettingObject(R.string.contracts_store,R.drawable.ic_contract_store,0));
        settingsData.add(new SettingObject(R.string.watch_contract,R.drawable.ic_contr_watch,0));
        settingsData.add(new SettingObject(R.string.watch_token,R.drawable.ic_token_watch,0));
        settingsData.add(new SettingObject(R.string.backup_contracts,R.drawable.ic_contr_backup,0));
        settingsData.add(new SettingObject(R.string.restore_contracts,R.drawable.ic_contract_restore,0));
    }

    List<SettingObject> getSettingsData() {
        return settingsData;
    }

    void onCreateContractClick(){
        TemplatesFragment smartContractListFragment = TemplatesFragment.newInstance();
        getView().openFragment(smartContractListFragment);
    }

    void onMyContractsClick(){
        MyContractsFragment myContractsFragment = MyContractsFragment.newInstance();
        getView().openFragment(myContractsFragment);
    }

    void onContractsStoreClick(){
        QStoreFragment qStroreFragment = QStoreFragment.newInstance();
        getView().openFragment(qStroreFragment);
    }

    void onWatchContractClick(){
        WatchContractFragment watchContractFragment = WatchContractFragment.newInstance(false);
        getView().openFragment(watchContractFragment);
    }

    void onWatchTokenClick(){
        WatchContractFragment watchContractFragment = WatchContractFragment.newInstance(true);
        getView().openFragment(watchContractFragment);
    }

    void onRestoreContractsClick(){
        RestoreContractsFragment restoreContractFragment = RestoreContractsFragment.newInstance();
        getView().openFragment(restoreContractFragment);
    }

    void onBackupContractsClick(){
        BackupContractsFragment backupContractsFragment = BackupContractsFragment.newInstance();
        getView().openFragment(backupContractsFragment);
    }

    @Override
    public SmartContractsFragmentView getView() {
        return mSmartContractsFragmentView;
    }
}