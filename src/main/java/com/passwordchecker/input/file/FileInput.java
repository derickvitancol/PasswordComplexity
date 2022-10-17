package com.passwordchecker.input.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Reader;
import java.io.FileReader;
import java.io.BufferedReader;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FileInput {

    private File passwordFile;

    public void setPasswordFile(String fileAddress)
    {
        File file = new File(fileAddress);
        if(file.exists())
        {
            this.passwordFile = file;
        }
    }

    public File getPasswordFile()
    {
        return this.passwordFile;
    }

    public List<String> readFile()
    {
        List<String> passwords = new ArrayList<>();
        try(Reader reader = new FileReader(this.passwordFile)) {
            BufferedReader bufferedReader = new BufferedReader(reader);
            passwords = bufferedReader.lines().collect(Collectors.toList());
            //for(String line = bufferedReader.readLine(); line != null; line = bufferedReader.readLine())
            //{
            //    passwords.add(line);
            //}
            return passwords;
        }
        catch(FileNotFoundException e )
        {
            System.out.println(e.getMessage());
        }catch(IOException e)
        {
            System.out.println(e.getMessage());
        }
        finally {
            return passwords;
        }
    }

}
