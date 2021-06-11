package me.metallicgoat.PopUpTowers;

import me.metallicgoat.PopUpTowers.versionsupport.BlockPlacer;
import me.metallicgoat.PopUpTowers.versionsupport.Legacy;
import me.metallicgoat.PopUpTowers.versionsupport.Newer;
import org.bukkit.Bukkit;
import org.bukkit.Server;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    private static Main instance;
    private final ConsoleCommandSender console = Bukkit.getConsoleSender();
    private final Server server = getServer();
    public String sversion;
    public BlockPlacer blockPlacer;

    public void onEnable() {
        if(!setupManager()){
            log("Failed to start. Unsupported server version.");
            Bukkit.getPluginManager().disablePlugin(this);
            return;
        }


        registerEvents();
        instance = this;
        PluginDescriptionFile pdf = this.getDescription();

        log(
                "------------------------------",
                pdf.getName() + " For MBedwars",
                "By: " + pdf.getAuthors(),
                "Version: " + pdf.getVersion(),
                "------------------------------"
        );

        getConfig().options().copyDefaults();
        saveDefaultConfig();

        RegisterTower rt = new RegisterTower();
        rt.registerItem();
    }

    private void registerEvents() {
        PluginManager manager = this.server.getPluginManager();
        manager.registerEvents(new ChestPlace(), this);
    }


    public static Main getInstance() {
        return instance;
    }

    public ConsoleCommandSender getConsole() {
        return console;
    }

    private void log(String ...args) {
        for(String s : args)
            getLogger().info(s);
    }

    private boolean setupManager(){
        sversion = "N/A";
        try {
            sversion = Bukkit.getServer().getClass().getPackage().getName().split("\\.")[3];
        }catch (ArrayIndexOutOfBoundsException e){
            return false;
        }
        System.out.println(sversion);

        if(sversion.equals("v1_8_R3")){
            blockPlacer = new Legacy();
        }else if (sversion.equals("v1_9_R2")) {
            blockPlacer = new Legacy();
        }else if (sversion.equals("v1_10_R1")) {
            blockPlacer = new Legacy();
        }else if (sversion.equals("v1_11_R1")) {
            blockPlacer = new Legacy();
        }else if (sversion.equals("v1_12_R1")) {
            blockPlacer = new Legacy();
        }else if (sversion.equals("v1_13_R2")) {
            blockPlacer = new Newer();
        }else if (sversion.equals("v1_14_R1")) {
            blockPlacer = new Newer();
        }else if (sversion.equals("v1_15_R1")) {
            blockPlacer = new Newer();
        }else if (sversion.equals("v1_16_R3")) {
            blockPlacer = new Newer();
        }
        return blockPlacer != null;
    }
}